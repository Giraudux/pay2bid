package com.alma.pay2bid;

import com.alma.pay2bid.common.IClient;
import com.alma.pay2bid.common.IServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Logger;

/**
 * @author Thomas Minier
 * @date 27/09/16
 */
public class Client extends UnicastRemoteObject implements IClient {

    private static final Logger LOGGER = Logger.getLogger("com.alma.pay2bid.Client.logger");
    private IServer server;

    public Client(IServer server) throws RemoteException {
        this.server = server;
    }

    public void submit(Auction auction) throws RemoteException {
        server.placeAuction(auction);
    }

    public void bidSold(IClient buyer) throws RemoteException {

    }

    public void newPrice(int price) throws RemoteException {

    }
}
