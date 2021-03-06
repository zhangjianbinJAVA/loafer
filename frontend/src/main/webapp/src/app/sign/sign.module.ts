import {NgModule} from "@angular/core";
import {FormsModule} from "@angular/forms";

import {SignInComponent} from "./sign-in.component";
import {SignUpComponent} from "./sign-up.component";
import {SignRoutingModule} from "./sign.routing.module";

@NgModule({
  imports: [FormsModule, SignRoutingModule],
  declarations: [SignInComponent, SignUpComponent],
  providers: []
})

export class SignModule {
}
