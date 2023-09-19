fun main(args: Array<String>) {
    fun main(args: Array<String>) {
        //задание 1
        val age1 = 42.0
        val age2 = 21.0
        //____

        //задание 2
        val avg1 = (age1 + age2)/2
        //___

        //задание 4
        val firstName: String = "Sofiya"
        val lastName: String = "Chernysheva"
        //____

        //5
        val fullName: String = firstName + " " + lastName
        println(fullName)

        //6
        val myDetails: String = "Привет, меня зовут $fullName"
        println(myDetails)

        //7
        val test: Triple <Int, Int, Int> = Triple(10,20,2004)

        //8
        val month = test.first
        val day = test.second
        val year = test.third

        //9
        val (a,_,c) = test

}
