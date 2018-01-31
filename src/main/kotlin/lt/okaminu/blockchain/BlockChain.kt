package lt.okaminu.blockchain

class BlockChain (private val blocks: ArrayList<Block> = arrayListOf()){
    fun addBlock(data: String) = blocks.add(Block(data))
    fun printAllBlocks() = blocks.forEach{println(it.data)}
}