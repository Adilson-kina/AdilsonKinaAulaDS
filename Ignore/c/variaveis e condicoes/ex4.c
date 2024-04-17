#include <stdio.h>

int main(){
  int lado1, lado2, area;
  printf("A seguir digite o tamanho dos dois lados do retangulo:");
  scanf("%d %d", &lado1, &lado2);
  area = lado2 * lado1;
  printf("A area do retangulo é de %d", area);
}
