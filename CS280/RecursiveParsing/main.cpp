
/* main.cc */

#include <iostream>
#include "complex.h"

using std::cout;
using std::endl;

int main(void) {

    complex a(1, 2);
    complex b(2, 3);

    int i = 5;

    cout << a << " + " << b << " = " << a + b << endl;
    cout << a << " - " << b << " = " << a - b << endl;
    cout << a << " * " << b << " = " << a * b << endl;
    cout << a << " / " << b << " = " << a / b << endl;

    cout << a << " + " << i << " = " << a + i << endl;
    cout << a << " - " << i << " = " << a - i << endl;
    cout << a << " * " << i << " = " << a * i << endl;
    cout << a << " / " << i << " = " << a / i << endl;

    cout << i << " + " << a << " = " << i + a << endl;
    cout << i << " - " << a << " = " << i - a << endl;
    cout << i << " * " << a << " = " << i * a << endl;
    cout << i << " / " << a << " = " << i / a << endl;

    return 0;
}

