class Complex:
    def __init__(self, a=0,b=0):
        self.a = a
        self.b = b
        
    def __str__(self):
        return '(' + str(self.a) + ', ' + str(self.b) + 'i)'

    def __add__(self, other):
        if isinstance(other, int):
            return Complex(self.a + other,self.b)
        elif isinstance(other, float):
            return Complex(self.a + other,self.b)
        elif isinstance(other, Complex):
            return Complex(self.a + other.a, self.b + other.b)
        else:
            raise TypeError
        
    def __sub__(self, other):
        if isinstance(other, int):
            return Complex(self.a - other,self.b)
        elif isinstance(other,float):
            return Complex(self.a -other,self.b)
        elif isinstance(other, Complex):
            return Complex(self.a - other.a, self.b-other.b)
        else:
            raise TypeError
        
    def __mul__(self, other):
        if isinstance(other, int):
            return Complex(self.a * other, self.b * other)
        elif isinstance(other, float):
            return Complex(self.a*other, self.b*other)
        elif isinstance(other, Complex):
            return Complex((self.a * other.a)+((-1)*self.b * other.b),((self.a*other.b)+(self.b*other.a)))
        else:
            raise TypeError

    def __truediv__(self, other):
        if isinstance(other,int):
            return Complex(self.a/other,self.b/other)
        elif isinstance(other,float):
            return Complex((self.a/other),(self.b/other))
        elif isinstance(other, Complex):
            den =(other.a * other.a)+((-1)*(other.b*(other.b*(-1))))
            return Complex((((self.a * other.a)+((-1)*self.b * other.b*(-1)))/(den)),((self.a*other.b*(-1))+(self.b*other.a))/den)
        else:
            raise TypeError


    def __radd__(other, self):
        return other + self
    
    def __rmul__(self, other):
        return self * other

    def __rsub__(self, other):
        return Complex(other) - self

    def __rtruediv__(self, other):
        return Complex(other) / self


if __name__ == '__main__':
    a = Complex(1, 2)
    b = Complex(2, 3)

    i = 5

    print('%s + %s = %s' % (a, b, a + b))
    print('%s - %s = %s' % (a, b, a - b))
    print('%s * %s = %s' % (a, b, a * b))
    print('%s / %s = %s' % (a, b, a / b))

    print('%s + %f = %s' % (a, i, a + i))
    print('%s - %f = %s' % (a, i, a - i))
    print('%s * %f = %s' % (a, i, a * i))
    print('%s / %f = %s' % (a, i, a / i))
    
    print('%f + %s = %s' % (i, a, i + a))
    print('%f - %s = %s' % (i, a, i - a))
    print('%f * %s = %s' % (i, a, i * a))
    print('%f / %s = %s' % (i, a, i / a))
