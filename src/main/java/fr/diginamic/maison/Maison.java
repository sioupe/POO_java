package fr.diginamic.maison;


public class Maison {

    private Piece[] pieces =new Piece[0];

    /*private int superficieTotal = 0;

    public int getSuperficieTotal() {
        return superficieTotal;
    }*/
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
       // superficieTotal += nouvellePiece.getSuperficie();
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

    public int superficieTypePiece(String typePiece){
        int superficieTotal =0;

        for (Piece piece:pieces){
            if (typePiece.equals (piece.getClass().getName().substring(piece.getClass().getName().lastIndexOf(".")+1))) {
                superficieTotal+=piece.getSuperficie();
            }
        }
        return superficieTotal;
    }
    public int nombreTypePiece(String typePiece){
        int nbPiece =0;

        for (Piece piece:pieces){
            if (typePiece.equals (piece.getClass().getName().substring(piece.getClass().getName().lastIndexOf(".")+1))) {
                nbPiece++;
            }
        }
        return nbPiece;
    }
}
