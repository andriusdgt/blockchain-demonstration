package lt.okaminu.blockchain

class HashCalculator (private val block: Block) {
    fun calculate(){
        block.hash = block.hash + block.nounce
    }
}