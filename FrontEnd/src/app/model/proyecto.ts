export class Proyecto {
    id? : number;
    nombrePro : string;
    descripcionPro : string;
    imgPro: String;

    constructor(nombrePro: string, descripcionPro: string){
        this.nombrePro = nombrePro;
        this.descripcionPro = descripcionPro;
        this.imgPro = this.imgPro;
    }
}