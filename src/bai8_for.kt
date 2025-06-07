fun main(args: Array<String>) {
//    var sum: Int=0;
    // dạng 1
//    for (i in 1..15 step 2){
//        println(i)
//        sum+=i
//    }
//    println(sum)

    // dạng 2
//    var gt: Int=1;
//    for (i in 1..4){
//        gt=gt*i;
//    }
//    println(gt)
    //dang 3:
//    for (i in 1 until 9){
//        println(i)
//    }

    var h=9;

    for (i in 1..9){
        for (j in 1..9){
            if(j==1||j==h||i==j){
                print("$i$j")
            }
            print("\t")
        }
        println()
    }
}