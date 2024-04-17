#include <stdio.h>

int main(){
  float consumo_medio, distancia, combustivel_gasto;
  printf("Digite a distancia(Km) e o combustivel gasto(L):");
  scanf("%f %f", &distancia, &combustivel_gasto);
  consumo_medio = distancia / combustivel_gasto;
  printf("O consumo medio é de %f Km/L", consumo_medio);
}
