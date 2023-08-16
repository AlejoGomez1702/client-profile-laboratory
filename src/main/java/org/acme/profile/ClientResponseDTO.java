package org.acme.profile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientResponseDTO {

    @JsonProperty("client")
    private ClientInfo clientInfo;

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    public static class ClientInfo {

        @JsonProperty("hasProducts")
        private boolean hasProducts;

        @JsonProperty("hasDebitCard")
        private boolean hasDebitCard;

        @JsonProperty("canOpenDigitalAccount")
        private boolean canOpenDigitalAccount;

        @JsonProperty("isDataUpdate")
        private boolean isDataUpdate;

        @JsonProperty("dataUpdateDays")
        private int dataUpdateDays;

        @JsonProperty("familyGroupRole")
        private int familyGroupRole;

        public boolean isHasProducts() {
            return hasProducts;
        }

        public void setHasProducts(boolean hasProducts) {
            this.hasProducts = hasProducts;
        }

        public boolean isHasDebitCard() {
            return hasDebitCard;
        }

        public void setHasDebitCard(boolean hasDebitCard) {
            this.hasDebitCard = hasDebitCard;
        }

        public boolean isCanOpenDigitalAccount() {
            return canOpenDigitalAccount;
        }

        public void setCanOpenDigitalAccount(boolean canOpenDigitalAccount) {
            this.canOpenDigitalAccount = canOpenDigitalAccount;
        }

        public boolean isDataUpdate() {
            return isDataUpdate;
        }

        public void setDataUpdate(boolean dataUpdate) {
            isDataUpdate = dataUpdate;
        }

        public int getDataUpdateDays() {
            return dataUpdateDays;
        }

        public void setDataUpdateDays(int dataUpdateDays) {
            this.dataUpdateDays = dataUpdateDays;
        }

        public int getFamilyGroupRole() {
            return familyGroupRole;
        }

        public void setFamilyGroupRole(int familyGroupRole) {
            this.familyGroupRole = familyGroupRole;
        }
    }
}
