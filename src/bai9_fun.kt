fun main(args: Array<String>) {
    println("Nhập a: ")
    var a: Double?=readLine()?.toDouble();
    println("Nhập b: ")
    var b: Double?=readLine()?.toDouble();
    println("Nhập dấu: ")
    var dau: String?=readLine();

    if(a!=null&&b!=null&&dau!=null){
       when(dau){
           "+"->Tong(a,b);
           "-"->Tru(a,b);
           "*"->Nhan(a,b);
           "/"->Chia(a,b);
       }
    }


}
fun tong(a:Int,b: Int): Int{
    return  a+b;
}
fun xinchao(){
    println("hello")
}

fun Tong(a: Double, b: Double){
    println("$a + $b = ${a+b}")
}
fun Tru(a: Double, b: Double){
    println("$a - $b = ${a-b}")
}
fun Nhan(a: Double, b: Double){
    println("$a * $b = ${a*b}")
}
fun Chia(a: Double, b: Double){
    if(b==0.0){
        println("Ko chia duoc")
    }
    println("$a / $b = ${a/b}")
}