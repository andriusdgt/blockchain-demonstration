package lt.okaminu.blockchain

import java.time.Instant

data class Block (val data: String, val timestamp: Long = Instant.now().epochSecond,
                  var hash: String = "", var previousHash: String = "", val nounce: Int = 0)
