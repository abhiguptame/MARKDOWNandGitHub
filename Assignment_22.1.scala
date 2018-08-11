// Databricks notebook source
/*
Given a list of strings - List[String] (“alpha”, “gamma”, “omega”, “zeta”, “beta”)
- find count of all strings with length 4
- convert the list of string to a list of integers, where each string is mapped to its
corresponding length
- find count of all strings which contain alphabet ‘m’
- find the count of all strings which start with the alphabet ‘a’
*/

var lst =  List[String] ("alpha", "gamma", "omega", "zeta", "beta") //Given list data

//Prints the count of all strings with length 4
var count_strings_length_4 = lst.count(s => s.length == 4 )
println("The count of all strings with length 4 is: "+ count_strings_length_4)

//Prints list of integers where each string is mapped to its corresponding length
var list_of_integers = lst.map(s => s.length)
println("The list of integers where each string is mapped to its corresponding length is: "+list_of_integers)

//Prints count of all strings which contain alphabet ‘m’
lst.forall(s =>s.endsWith("o"))

// COMMAND ----------

/*
Create a Scala application to find the GCD of two numbers.
*/
def gcd(a: Int,b: Int): Int = {
       if(b ==0) a else gcd(b, a%b)
    }

var a = 10
var b = 3

println("The gcd of "+ a + " and is " + b +" is: " +gcd(a,b))


// COMMAND ----------

class Calculator{
  var result = 0
  
  def add(a: Int, b: Int ) {
    result =  a + b
    println(result)
  }
  
  def sub(a: Int, b: Int )
  {
    result =  a - b
    println(result)
  }
  
  def mul(a: Int, b: Int ) {
   result =  a * b
    println(result)
  }
  
  def add(c: Int){
    result += c
    println(result)
  }
  
  def sub(c: Int){
    result -= c
    println(result)
  }
  
  def mul(c: Int){
    result *= c
    println(result)
  }
  
}

// COMMAND ----------

var calc = new Calculator

// COMMAND ----------

calc.add(4, 5)

// COMMAND ----------

calc.sub(4, 5)

// COMMAND ----------

calc.mul(4, 5)

// COMMAND ----------

calc.result

// COMMAND ----------


