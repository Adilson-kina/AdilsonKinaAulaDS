#include <stdio.h>

int main(){
  int num;
  printf("digite um numero:");
  scanf("%d", &num);
  printf("O antecessor de %d é %d", num, num - 1);
}
