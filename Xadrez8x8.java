public class Xadrez8x8
{
    public static void main(String [] arg)
    {
        int tabuleiro[][];
        int l, c, caux, laux, lv, cv;
        tabuleiro = new int[9][9];
        for(l = 0 ; l < 8 ; l ++)
        {
            for(c = 0 ; c < 8 ; c ++)
            {
                tabuleiro[l][c] = 0;
            }
        }
        for(l = 0 ; l < 8 ; l ++)
        {
            for(c = 0 ; c < 8 ; c ++)
            {
                if (tabuleiro[l][c] == 0)
                {
                    tabuleiro [l][c] = 9;
                    // preencher reta abaixo
                    for(laux = (l + 1) ; laux < 8 ; laux ++)
                    {
                        tabuleiro[laux][c] = 1;
                    }
                    // preencher reta acima
                    for(laux = (l - 1) ; laux > 0 ; laux --)
                    {
                        tabuleiro[laux][c] = 1;
                    }
                    // preencher reta para a direita
                    for(caux = (c + 1) ; caux < 8 ; caux ++)
                    {
                        tabuleiro[l][caux] = 1;
                    }
                    // preencher reta para a esquerda
                    for(caux = (c - 1) ; caux > 0 ; caux --)
                    {
                        tabuleiro[l][caux] = 1;
                    }
                    for (int i = 1; i < 8; i++) {
                        // preencher diagonal superior direita
                        if (l - i >= 0 && c + i < 8) {
                            tabuleiro[(l - i)][(c + i)] = 1;
                        }
                        // preencher diagonal superior esquerda
                        if (l - i >= 0 && c - i >= 0) {
                            tabuleiro[(l - i)][(c - i)] = 1;
                        }
                        // preencher diagonal inferior direita
                        if (l + i < 8 && c + i < 8) {
                            tabuleiro[(l + i)][(c + i)] = 1;
                        }
                        // preencher diagonal inferior esquerda
                        if (l + i < 8 && c - i >= 0) {
                            tabuleiro[(l + i)][(c - i)] = 1;
                        }
                    }
                }
            }
        }
        for(lv = 0 ; lv < 8 ; lv ++)
        {
        for(cv = 0 ; cv < 8 ; cv ++)
        {
            if(cv == 7)
            {
                System.out.println(tabuleiro[lv][cv]);
            }
            else System.out.print(tabuleiro[lv][cv]);
        }
        }
        System.out.println();
    }
}