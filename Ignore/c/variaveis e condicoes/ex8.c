#include <stdio.h>

int main(){
  int ano_pessoa, mes_pessoa, dia_pessoa, dias;
  printf("Digite a quantos anos, meses e dias você esta vivo(a):");
  scanf("%d %d %d", &ano_pessoa, &mes_pessoa, &dia_pessoa);
  dias = dia_pessoa + (mes_pessoa * 30) + (ano_pessoa * 365);
  printf("Você esta vivo a %d dias", dias);
}
