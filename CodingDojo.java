public class CodingDojo{
    
    public static void main(String[] args){
        int[] x = {1,1,2,2,2,3,3};
        int[] y = {3,4,1,3,5,3,4};
        System.out.print((rombos(x, y)));
    }
    
    private static int rombos(int[] x,int[] y){
        int rombos = 0;
        double distancia = 0.0;
        double compDistancia1 = 0.0;
        double compDistancia2 = 0.0;
        Coordenadas[] coordenadas;
        Coordenadas[] posiblesRombosX;
        for(int i=0;i<x.length;i++){
            coordenadas[i].x=x[i];
            coordenadas[i].y=y[i];
        }
        for(int i = 0; i < coordenadas.length; i++){
            for (int j = 0;j < coordenadas.length; j++){
                if((coordenadas[i].x == coordenadas[j].x) && (coordenadas[i].y == coordenadas[j].y)){                   
                }else{
                    if(coordenadas[i].x == coordenadas[j].x && coordenadas[i].y != coordenadas[j].y){
                        distancia = evaluarDistancia(coordenadas[i].y, coordenadas[j].y);
                        if(distancia > 1.0){
                            posiblesRombosX[0].x=coordenadas[i].x;
                            posiblesRombosX[0].y=coordenadas[i].y;
                            posiblesRombosX[1].x=coordenadas[j].x;
                            posiblesRombosX[1].y=coordenadas[j].y;
                            for(int z = 0;z < coordenadas.length; z++){
                                if((posiblesRombosX[0].x == coordenadas[z].x) && (posiblesRombosX[0].y == coordenadas[z].y)
                                || (posiblesRombosX[1].x == coordenadas[z].x) && (posiblesRombosX[1].y == coordenadas[z].y)){

                                }
                                else{
                                    for(int s = 0;s < coordenadas.length; s++){
                                        if((coordenadas[z].x == coordenadas[s].x) && (coordenadas[z].y == coordenadas[s].y)){

                                        }else if((posiblesRombosX[0].x == coordenadas[s].x) && (posiblesRombosX[0].y == coordenadas[s].y)
                                        || (posiblesRombosX[1].x == coordenadas[s].x) && (posiblesRombosX[1].y == coordenadas[s].y)){

                                        }else{
                                            compDistancia1 = evaluarCompDistancia(posiblesRombosX[0].x, coordenadas[z].x,posiblesRombosX[0].y, coordenadas[z].y);
                                            compDistancia2 = evaluarCompDistancia(posiblesRombosX[1].x, coordenadas[z].x,posiblesRombosX[1].y, coordenadas[z].y);
                                            if(compDistancia1 == compDistancia2){
                                                compDistancia1 = evaluarCompDistancia(posiblesRombosX[0].x, coordenadas[s].x,posiblesRombosX[0].y, coordenadas[s].y);
                                                compDistancia2 = evaluarCompDistancia(posiblesRombosX[1].x, coordenadas[s].x,posiblesRombosX[1].y, coordenadas[s].y);
                                                if(compDistancia1 == compDistancia2){
                                                    rombos++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }else if(coordenadas[i].x != coordenadas[j].x && coordenadas[i].y == coordenadas[j].y){
                        distancia = evaluarDistancia(coordenadas[i].y, coordenadas[j].y);
                        if(distancia > 1.0){
                            posiblesRombos[0].x=coordenadas[i].x;
                            posiblesRombos[0].y=coordenadas[i].y;
                            posiblesRombos[1].x=coordenadas[j].x;
                            posiblesRombos[1].y=coordenadas[j].y;
                            for(int z = 0;z < coordenadas.length; z++){
                                if((posiblesRombosX[0].x == coordenadas[z].x) && (posiblesRombosX[0].y == coordenadas[z].y)
                                || (posiblesRombosX[1].x == coordenadas[z].x) && (posiblesRombosX[1].y == coordenadas[z].y)){

                                }
                                else{
                                    for(int s = 0;s < coordenadas.length; s++){
                                        if((coordenadas[z].x == coordenadas[s].x) && (coordenadas[z].y == coordenadas[s].y)){

                                        }else if((posiblesRombosX[0].x == coordenadas[s].x) && (posiblesRombosX[0].y == coordenadas[s].y)
                                        || (posiblesRombosX[1].x == coordenadas[s].x) && (posiblesRombosX[1].y == coordenadas[s].y)){

                                        }else{
                                            compDistancia1 = evaluarCompDistancia(posiblesRombosX[0].x, coordenadas[z].x,posiblesRombosX[0].y, coordenadas[z].y);
                                            compDistancia2 = evaluarCompDistancia(posiblesRombosX[1].x, coordenadas[z].x,posiblesRombosX[1].y, coordenadas[z].y);
                                            if(compDistancia1 == compDistancia2){
                                                compDistancia1 = evaluarCompDistancia(posiblesRombosX[0].x, coordenadas[s].x,posiblesRombosX[0].y, coordenadas[s].y);
                                                compDistancia2 = evaluarCompDistancia(posiblesRombosX[1].x, coordenadas[s].x,posiblesRombosX[1].y, coordenadas[s].y);
                                                if(compDistancia1 == compDistancia2){
                                                    rombos++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return rombos;
    }  
    
    private static double evaluarDistancia(int x, int y){
        return Math.sqrt( ( (Math.pow(2, x))+(Math.pow(2, y)) ) );
    }

    private static double evaluarCompDistancia(int x1, int y1, int x2, int y2){
        return Math.sqrt( ( (Math.pow(2, (x2+x1))) + (Math.pow(2, (y2+y1))) ) );
    }
}