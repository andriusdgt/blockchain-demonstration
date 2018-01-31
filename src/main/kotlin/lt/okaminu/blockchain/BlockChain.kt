package lt.okaminu.blockchain

class BlockChain(private val blocks: ArrayList<Block> = arrayListOf(Block("genesis block", "123"))) {

    fun addBlock(data: String){
        val block = Block(data, blocks.last().previousHash)
        val (hash, nounce) = calculateHash(block)
        block.hash = hash
        block.nounce = nounce
        blocks.add(block)
    }

    fun printAllBlocks() =
            blocks.forEach { println("time=${it.timestamp} data=${it.data} nounce=${it.nounce} hash=${it.hash} " +
                    "previousHash=${it.previousHash}") }

}