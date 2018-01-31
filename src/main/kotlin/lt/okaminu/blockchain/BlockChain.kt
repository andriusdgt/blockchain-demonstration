package lt.okaminu.blockchain

class BlockChain(private val blocks: ArrayList<Block> = arrayListOf(Block("genesis block"))) {

    fun addBlock(data: String) = blocks.add(Block(data))

    fun printAllBlocks() =
            blocks.forEach { println("time=${it.timestamp} data=${it.data} nounce=${it.nounce} hash=${it.hash}") }

}