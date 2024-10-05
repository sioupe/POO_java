package fr.diginamic.maison;

import javax.lang.model.type.NullType;

public class Maison {

    private Piece[] pieces =new Piece[0];


    public void ajouterPiece(Piece nouvellePiece){
        if (nouvellePiece==null){
            System.out.println("rentré une piece please");
            return ;
        }
        if (nouvellePiece.getSuperficie()<=0 || nouvellePiece.getEtage()<0){
            System.out.println("Faite une piece qui peux exister");
            return;
        }
        Piece[] tampon = new Piece[pieces.length];
        for (int i = 0; i < pieces.length; i++) {
            tampon[i]=pieces[i];
        }
        pieces=new Piece[pieces.length+1];
        for (int i = 0; i < tampon.length; i++) {
            pieces[i]=tampon[i];
        }
        pieces[pieces.length-1]=nouvellePiece;
    }

    public int superficieTotal(){
        int superficieTotal =0;
        for (Piece piece:pieces){
            superficieTotal += piece.getSuperficie();
        }
        return superficieTotal;
    }
    public int superficieEtage(int etage){
        int superficieTotal =0;
        for (Piece piece:pieces){
            if (etage == piece.getEtage()) {
                superficieTotal += piece.getSuperficie();
            }
        }
        return superficieTotal;
    }

}
