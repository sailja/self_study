import { Component } from "@angular/core";

@Component({
    selector: 'app-server',
    templateUrl: './server.component.html'
})
export class ServerComponent {
    
    isDisable: boolean = true;
    serverName: String = "Test-Server";
    serverCreationStatus: String = "No Server was created";

    constructor() {
        setTimeout(() => {
            this.isDisable = false;
        }, 5000);
    }

    onCreateServer(): void {
        this.serverCreationStatus = "Server was created. Name: " + this.serverName;
    }

    // onUpdateServerName(event:any ) {
    //     this.serverName = event.target.value;
    // }
}