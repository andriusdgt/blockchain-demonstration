package lt.okaminu.blockchain

import java.time.Instant.now

class BlockChain(private val blocks: ArrayList<Block> = arrayListOf()) {

    fun addBlock(data: String) = blocks.add(Block(now().epochSecond, data))

    fun printAllBlocks() = blocks.forEach { println("time=${it.timestamp} data=${it.data}") }

}