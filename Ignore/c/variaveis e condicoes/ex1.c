#include <stdio.h>

int main(){
  int num1, num2;
  printf("Digite dois numeros:");
  scanf("%d %d", &num1, &num2);
  int soma = num1 + num2;
  int sub = num1 - num2;
  int mult = num1 * num2;
  float div = (float) num1 / num2;
  printf("Soma:%d \nSubtracao:%d \nMultiplicacao:%d \nDivisao:%.2f", soma, sub, mult, div);
}
