#include <stdio.h>

int main(){
  float km_l, distancia_km, preco_gas, custo;
  printf("Digite na ordem, quantos quilometros por litro seu carro faz, a distancia de sua viagem(km) e o preço da gasolina:");
  scanf("%f %f %f", &km_l, &distancia_km, &preco_gas);
  custo = (distancia_km / km_l) * preco_gas; 
  printf("A viagem custará R$%.2f\n", custo);
}
