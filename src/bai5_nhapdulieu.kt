import kotlin.math.PI
import kotlin.math.pow

fun main(args: Array<String>) {
//   var r:Double;
//
//    println("Nhập r: ");
//
//    var s: String?=readLine();
//
//    if(s!=null){
//        r=s.toDouble();
//        println("chu vi: ")
//        var result=2* PI*r;
//        println(result)
//        println("dien tich: ")
//        var result1=PI*r*r;
//        println(result1)
//    }

    var a:Double;
    var b:Double;


    println("Nhập a: ");

    var s: String?=readLine();
    println("Nhập b: ");
    var r: String?=readLine();

    if(s!=null&& r!=null){
        a=s.toDouble();
        b=r.toDouble();
        println("Diện tích: "+ a*b);
        println("Chu vi : "+ (a+b)*2);
    }


}