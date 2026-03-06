import socket

HOST = '127.0.0.1'
PORT = 5001

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as client_socket:
    client_socket.connect((HOST, PORT))
    message = "Top Secret Message!"
    client_socket.sendall(message.encode())
    print("Message sent to server.")