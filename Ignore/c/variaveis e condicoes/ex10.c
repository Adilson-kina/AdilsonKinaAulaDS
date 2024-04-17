#include <stdio.h>

int main(){
  float salario, reajuste_salario, salario_final;
  printf("Digite o seu salario e quantos porcentos a mais sera o reajuste de seu salario:");
  scanf("%f %f", &salario, &reajuste_salario);
  reajuste_salario /= 100;
  salario_final = salario + (salario * reajuste_salario);
  printf("O seu salario final sera de R$%.2f \n", salario_final);
}
