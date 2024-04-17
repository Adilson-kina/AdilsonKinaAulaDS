#include <stdio.h>

int main(){
  float eleitores, voto_branco, voto_nulo, voto_valido, porcento_valido, porcento_branco, porcento_nulo;
  printf("Digite na ordem quantos eleitores, votos validos, votos brancos e votos nulos:\n");
  scanf("%f %f %f %f", &eleitores, &voto_valido, &voto_branco, &voto_nulo);
  porcento_valido = (voto_valido / eleitores) * 100;
  porcento_nulo = (voto_nulo / eleitores) * 100;
  porcento_branco = (voto_branco / eleitores) * 100;
  printf("nulos:%1.f%% \nbrancos:%1.f%% \nvalidos:%.1f%% \n", porcento_nulo, porcento_branco, porcento_valido);
}
