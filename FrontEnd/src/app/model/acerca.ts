export class Acerca {
    id? : number;
    nombreA : string;
    descripcionA : string;
    tituloA: string;
    imgA: string;

    constructor(nombreA: string, descripcionA: string, tituloA: string, imgA: string){
        this.nombreA = nombreA;
        this.descripcionA = descripcionA;
        this.tituloA = tituloA;
        this.imgA = imgA;
    }
}