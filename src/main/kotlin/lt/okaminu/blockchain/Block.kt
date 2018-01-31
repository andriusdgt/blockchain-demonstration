package lt.okaminu.blockchain

import java.time.Instant

data class Block (val data: String, var previousHash: String, var hash: String = "",
                  val timestamp: Long = Instant.now().epochSecond, var nounce: Int = 0)
