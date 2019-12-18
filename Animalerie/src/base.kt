fun main(){
    val animalerie = Animalerie()

    animalerie.SeDeplaceAQuatrePattes(lion())
    animalerie.SeDeplaceAQuatrePattes(loup())
    animalerie.SeDeplaceAQuatrePattes(hyene())
    animalerie.SeDeplaceAQuatrePattes(grenouille())
    animalerie.SeDeplaceADeuxPattes(hibou())

    for (espece in animalerie.list1){
        espece.quiSuisJe()
    }
    for (espece in animalerie.list2) {
        espece.quiSuisJe()
    }

    val arr= arrayOf(lion(),hyene(),loup(),grenouille())
    for(espece in arr){
        espece.quiSuisJe()
        espece.nombrePattes()
        espece.bruit()
    }
    val arr2= arrayOf(hibou(),coq())
    for(espece2 in arr2){
        espece2.quiSuisJe()
        espece2.nombrePattes()
        espece2.bruit()
    }
}
