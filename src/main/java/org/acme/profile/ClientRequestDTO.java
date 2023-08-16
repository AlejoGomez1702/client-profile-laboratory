package org.acme.profile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientRequestDTO {

    @JsonProperty("client")
    private ClientInfo clientInfo;

    @JsonProperty("searchOnReplica")
    private boolean searchOnReplica;

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    public boolean isSearchOnReplica() {
        return searchOnReplica;
    }

    public void setSearchOnReplica(boolean searchOnReplica) {
        this.searchOnReplica = searchOnReplica;
    }

    public static class ClientInfo {

        @JsonProperty("documentNumber")
        private String documentNumber;

        @JsonProperty("documentType")
        private String documentType;

        public String getDocumentNumber() {
            return documentNumber;
        }

        public void setDocumentNumber(String documentNumber) {
            this.documentNumber = documentNumber;
        }

        public String getDocumentType() {
            return documentType;
        }

        public void setDocumentType(String documentType) {
            this.documentType = documentType;
        }
    }
}
