package com.dongkui.myfirstkotlin

/**
 * Created on 2020/3/25.
 * @author dongkui
 */
object Kotlin01 {

    @JvmStatic
    fun main(args: Array<String>) {
        print("kotlin")
        when01("大哥")
        when01("大宝")
        when01("哎呀")
        array01()
    }

    fun when01(str: String) {

        when (str) {  // 相当于switch
            "大哥" -> println(str + "大帅哥")
            "大宝" -> println(str + "大美女")
            else -> println(str + "啦啦啦")
        }
    }

    fun array01() {
//        var arr = 1 until 10 // 创建数组1-9
        var arr = 1..10 // 创建数组1-10
        var sum = 0
        for (result in arr step 2) {// step 每个
            sum += result
            println("result=$result")
        }
        for (element in arr.reversed()) {// 反向打印
            println("element=$element")
        }

        var count = arr.count()
        println("count=$count")// 数组的大小
        print(sum)

        var strs = listOf("大宝", "小宝")

        for ((index, value) in strs.withIndex()) {
            println("index=$index,value=$value")
        }

        var map = HashMap<String, String>()
        map["numberOne"] = "大宝"

    }


}
