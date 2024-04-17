#include <stdio.h>

int main(){
  int num1, num2, holder;
  printf("Digite dois numeros:");
  scanf("%d %d", &num1, &num2);
  holder = num1;
  num1 = num2;
  num2 = holder;
  printf("num1:%d, num2:%d", num1, num2);
}
