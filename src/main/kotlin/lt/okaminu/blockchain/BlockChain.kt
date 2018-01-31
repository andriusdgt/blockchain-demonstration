package lt.okaminu.blockchain

class BlockChain {

    val blocks: ArrayList<Block> = arrayListOf(createBlock("genesis block", "123"))

    fun addBlock(data: String) {
        blocks.add(createBlock(data, blocks.last().hash))
    }

    fun createBlock(data: String, previousHash: String): Block {
        val block = Block(data, previousHash)
        val (hash, nounce) = calculateHash(block)
        block.hash = hash
        block.previousHash = previousHash
        block.nounce = nounce
        return block
    }

    fun printAllBlocks() =
            blocks.forEach {
                println("time=${it.timestamp} data=${it.data} nounce=${it.nounce} hash=${it.hash} " +
                        "previousHash=${it.previousHash}")
            }

    fun validateBlocks(){
        for (block in blocks){
            if(isHashValid(block.hash) && block.hash == getStringDigest(block))
                println("block ${block.hash} is valid")
            else
                println("block ${block.hash} is invalid")
        }
    }

}