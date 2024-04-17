#include <stdio.h>

int main(){
  float custo_fabrica, porcentagem_fornecedor, imposto, custo_final;
  porcentagem_fornecedor = 0.28;
  imposto = 0.45;
  printf("Digite o preço de fabrica do carro:");
  scanf("%f", &custo_fabrica);
  custo_final = custo_fabrica + (custo_fabrica * porcentagem_fornecedor) + (custo_final * imposto);
  printf("O carro custará R$%.2f \n", custo_final);
}
