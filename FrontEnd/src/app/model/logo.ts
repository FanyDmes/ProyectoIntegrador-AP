export class Logo {
    id? : number;
    nombreL : string;
    descripcionL : string;
    imgL : string;

    constructor(nombreL: string, descripcionL: string, imgL : string){
        this.nombreL = nombreL;
        this.descripcionL = descripcionL;
        this.imgL = imgL;
    }
}