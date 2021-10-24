fun main(){
    val likes = 100356 //количество лайков вписывается вручную

    val likesStringEnd = when {
        likes % 100 == 11 -> "людям" //проверка если есть на конце 11
        likes % 10 == 1 -> "человеку" //проверка если оканчивается на 1
        else -> "людям"
    }
    
    println("Понравилось $likes $likesStringEnd")
}