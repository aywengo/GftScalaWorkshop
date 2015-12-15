var f = false
var t = true
"Logical Not of !(x && y) = " + !(f && t)
"Logical Or of x || y = " + (f || t)
"Logical And of x && y = " + (f && t)

var x = 16
var y = 12
var z = 0
"Addition of x + y = " + (x + y)
"Subtraction of x - y = " + (x - y)
"Multiplication of x * y = " + (x * y)
"Division of x / y = " + (x / y)
"Modulus of x % y = " + (x % y)
"Equality of   x == y is : " + (x == y)
"Not Equals of x != y is : " + (x != y)
"Greater than of x > y is : " + (x > y)
"Lesser than of   x < y is : " + (x < y)
"Greater than or Equal to of x >= y is : " + (x >= y)
"Lesser than or Equal to of x <= y is : " + (x <= y)


z = x & y
"Bitwise And of x & y = " + z

z = x | y
"Bitwise Or of x | y = " + z

z = x ^ y
"Bitwise Xor of x ^ y = " + z

z = ~x
"Bitwise Ones Complement of ~x = " + z

z = x << 2
"Bitwise Left Shift of x << 2 = " + z

z = x >> 2
"Bitwise Right Shift of x >> 2 = " + z

z = x >>> 2
"Bitwise Shift Right x >>> 2 = " + z


z = x + y
"z= x+ y = " + z

z += x
"Add and assignment of z += x = " + z

z -= x
"Subtract and assignment of z -= x = " + z

z *= x
"Multiplication and assignment of z *= x = " + z

x = 20
z = 15
z /= x
"Division and assignment of z /= x = " + z

x = 30
z = 15
z %= x
"Modulus and assignment of z %= x = " + z

z <<= 2
"Left shift and assignment of z <<= 2 = " + z

z >>= 2
"Right shift and assignment of z >>= 2 = " + z

z &= x
"Bitwise And assignment of z &= 2 = " + z

z ^= x
"Bitwise Xor and assignment of z ^= x = " + z

z |= x
"Bitwise Or and assignment of z |= x = " + z

