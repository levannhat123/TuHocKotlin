fun main(args: Array<String>) {
    // Có 5 kiểu dữ liệu cơ bản
    /*
    number
    char
    string
    boolean
    array
     Có 2 kiểu dữ liệu đó là
     1 Nguyên thủy:

    Byte	Số nguyên 8-bit	8-bit
    Short	Số nguyên 16-bit	16-bit
    Int	Số nguyên 32-bit	32-bit
    Long	Số nguyên 64-bit	64-bit
    Float	Số thực dấu chấm động đơn	32-bit
    Double	Số thực dấu chấm động kép	64-bit
    Char	Ký tự Unicode	16-bit
    Boolean false/true  1-bit

    2  Kiểu dữ liệu Tham Chiếu:

    String	Chuỗi văn bản
    Array, List, Set, Map	Cấu trúc dữ liệu tập hợp
    Any, Unit, Nothing, Nullable types (String?, Int?)	Kiểu đặc biệt
    Custom Class / Object	Kiểu người dùng tự định nghĩa


     */
    var a: Int=3;
    println(a::class.java.typeName);

    val array=arrayOf("2",'2','2')
    println(array.joinToString())
}