
/* Complex.cc */

#include <iostream>
#include "complex.h"

complex::complex(double x, double y) : x(x), y(y) {}

complex complex::operator+(const complex &o) const {

    return complex(x + o.x,y+ o.y);
}

complex complex::operator+(double n) const {

    return complex(x + n , y);
}

complex complex::operator-(const complex &o) const {

    return complex(x - o.x , y - o.y);
}

complex complex::operator-(double n) const {

    return complex(x - n , y);
}

complex complex::operator*(const complex &o) const {

    return complex((x * o.x)+((-1)*y * o.y),((x*o.y)+(y*o.x)));
}

complex complex::operator*(double n) const {

    return complex(x * n, n*y);
}

complex complex::operator/(const complex &o) const {
  double  den =(o.x * o.x)+((-1)*(o.y*(o.y*(-1))));
    return complex((((x * o.x)+((-1)*y * o.y*(-1)))/(den)),((x*o.y*(-1))+(y*o.x))/den);
}

complex complex::operator/(double n) const {

    return complex(x/n, y /n);
}





complex operator+(int n, const complex &o) {

    return o + n;
}

complex operator-(int n, const complex &o) {

    return complex(n) - o;
}

complex operator*(int n, const complex &o) {

    return o * n;
}

complex operator/(int n, const complex &o) {

    return complex(n) / o;
}

ostream &operator<<(ostream &out, const complex &o) {

    out << '(' << o.x << "," << o.y << "i)";
    return out;
}

