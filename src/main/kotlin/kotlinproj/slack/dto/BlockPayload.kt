package kotlinproj.slack.dto

data class BlockPayload(val type: String, val user: User, val api_app_id: String, val token: String,
                        val container: Container, val trigger_id: String, val team: Team,
                        val channel: Channel, val message: Message, val state: State,
                        val response_url: String, val actions: List<Action>)

data class User(val id: String, val username: String, val name: String, val team_id: String)
data class Container(val type: String, val message_ts: String, val channel_id: String, val is_ephemeral: Boolean)
data class Team(val id: String, val domain: String)
data class Message(val type: String, val subtype: String, val text: String, val ts: String, val bot_id: String, val blocks: List<Block>)
data class Block(val type: String, val block_id: String, val text: Text?)
data class Text(val type: String, val text: String, val verbatim: Boolean)
data class Action(val action_id: String, val block_id: String, val text: Text, val type: String, val action_ts: String)
data class State(val values: Map<String, Map<String, TimePickerValue>>)
data class TimePickerValue(val type: String, val selected_time: String)
data class Channel(val id: String, val name: String)