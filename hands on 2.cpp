#include <stdio.h>

int main(){
	int b = 10, h = 5, a, *x, *y, *z;
	y = &b;
	x = &h;
	a = *y / 2 * *x;
	z = &a;
	
	printf("The answer is: %d",*z);
	
	return 0;
}
