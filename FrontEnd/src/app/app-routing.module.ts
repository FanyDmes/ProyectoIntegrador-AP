import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditAcercaComponent } from './components/acerca-de/edit-acerca-de.component';
import { NewAcercaComponent } from './components/acerca-de/new-acerca-de.component';
import { EditEducacionComponent } from './components/educacion/edit-educacion.component';
import { NewEducaionComponent } from './components/educacion/new-educacion.component';
import { EditExperienciaComponent } from './components/experiencia/edit-experiencia.component';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { HomeComponent } from './components/home/home.component';
import { EditHySComponent } from './components/hys/edit-hys.component';
import { NewHySComponent } from './components/hys/new-hys.component';
import { LoginComponent } from './components/login/login.component';
import { EditProyectoComponent } from './components/proyecto/edit-proyecto.component';
import { NewProyectoComponent } from './components/proyecto/new-proyecto.component';


const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'nuevaexp', component: NewExperienciaComponent},
  { path: 'editexp/:id', component: EditExperienciaComponent},
  { path: 'nuevaedu', component: NewEducaionComponent},
  { path: 'editedu/:id', component: EditEducacionComponent},
  { path: 'nuevopro', component: NewProyectoComponent},
  { path: 'editpro/:id', component: EditProyectoComponent},
  { path: 'nuevahys', component: NewHySComponent},
  { path: 'edithys/:id', component: EditHySComponent},
  { path: 'nuevoacerca', component: NewAcercaComponent},
  { path: 'editacerca/:id', component: EditAcercaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }