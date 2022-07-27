export class Footer {
    id? : number;
    nombreF : string;
    descripcionF : string;
    ubicacion: string;

    constructor(nombreF: string, descripcionF: string, ubicacion: string){
        this.nombreF = nombreF;
        this.descripcionF = descripcionF;
        this.ubicacion = ubicacion;
    }
}