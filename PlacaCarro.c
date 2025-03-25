#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <ctype.h>

bool confereMercoSul(char placa[]) {
    if (strlen(placa) != 7) return false;

    // Verifica os 3 primeiros caracteres (devem ser maiúsculas)
    for (int i = 0; i < 3; i++) {
        if (!isupper(placa[i])) return false;
    }

    // O 4º caractere deve ser um número
    if (placa[3] < '0' || placa[3] > '9') return false;

    // O 5º caractere deve ser uma letra maiúscula
    if (!isupper(placa[4])) return false;

    // Os últimos 2 caracteres devem ser números
    for (int i = 5; i < 7; i++) {
        if (placa[i] < '0' || placa[i] > '9') return false;
    }

    return true;
}

bool conferePlacaBrasil(char placa[]) {
    if (strlen(placa) != 8) return false;

    // O 4º caractere deve ser um hífen '-'
    if (placa[3] != '-') return false;

    // Os 3 primeiros caracteres devem ser maiúsculos
    for (int i = 0; i < 3; i++) {
        if (!isupper(placa[i])) return false;
    }

    // Os últimos 4 caracteres devem ser números
    for (int i = 4; i < 8; i++) {
        if (placa[i] < '0' || placa[i] > '9') return false;
    }

    return true;
}

int main() {
    char placaCarro[10];
    scanf("%s", placaCarro);

    
    if (conferePlacaBrasil(placaCarro)) {
        printf("1\n");  // Placa do Brasil
    } else if (confereMercoSul(placaCarro)) {
        printf("2\n");  // Placa do Mercosul
    } else {
        printf("0\n");  // Placa falsificada
    }

    return 0;
}
