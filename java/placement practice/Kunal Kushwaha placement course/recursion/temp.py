'''
from scapy.all import sniff

def show_packet(packet):
    print(packet.summary())

# Sniff first 20 packets on default interface
sniff(count=20, prn=show_packet, store=False)

'''

'''
from scapy.all import sniff, send

# Capture one packet
pkt = sniff(count=1)[0]
print("Original packet:")
print(pkt.summary())

# Modify a NON-dangerous field
pkt.ttl = 99

print("Modified packet:")
print(pkt.summary())

# Retransmit on network
send(pkt)

'''


'''
from scapy.all import IP, TCP

target_ip = "192.168.1.10"
target_port = 80

# Simulate creation of multiple SYN packets
for i in range(5):
    syn_packet = IP(dst=target_ip) / TCP(dport=target_port, flags="S", seq=1000+i)
    print(syn_packet.summary())

    
    '''


'''
from scapy.all import IP, ICMP

target_ip = "192.168.1.10"
packets = []

# Build multiple packets (simulation only)
for i in range(10):
    pkt = IP(dst=target_ip) / ICMP() / ("X" * 100)
    packets.append(pkt)
    print(pkt.summary())

print("\n[Simulation complete: Packets prepared but NOT sent]")
'''


import random

print("=== Network Security Simulation (Colab Version) ===")

# ---------------------------------------------------------
# A. Packet Sniffing (Simulated)
# ---------------------------------------------------------
def sniff_packets():
    print("\n[PACKET SNIFFING SIMULATION]")
    for i in range(10):
        print(f"Packet {i+1}: SRC=192.168.1.{random.randint(1,254)} -> DST=192.168.1.100 | TCP")
    print("[Completed Sniffing]\n")


# ---------------------------------------------------------
# B. Capture, Modify & Retransmit Packet (Simulated)
# ---------------------------------------------------------
def capture_modify_retransmit():
    print("[CAPTURE AND MODIFY PACKET SIMULATION]")

    original = {
        "src": f"10.0.0.{random.randint(1,254)}",
        "dst": "192.168.1.5",
        "protocol": "TCP"
    }

    print("Original Packet:", original)

    modified = original.copy()
    modified["dst"] = "192.168.1.10"

    print("Modified Packet:", modified)
    print("[Packet Retransmitted Successfully]\n")


# ---------------------------------------------------------
# C. SYN Flood Simulation (Executable)
# ---------------------------------------------------------
def syn_flood():
    print("[SYN FLOOD SIMULATION]")
    target_ip = "192.168.1.5"
    target_port = 80

    for i in range(20):
        print(f"SYN Packet {i+1}: SRC IP = {random.randint(1,255)}.{random.randint(1,255)}."
              f"{random.randint(1,255)}.{random.randint(1,255)} -> {target_ip}:{target_port}")

    print("[SYN Flood Completed]\n")


# ---------------------------------------------------------
# D. ICMP DoS Simulation (Executable)
# ---------------------------------------------------------
def icmp_dos():
    print("[ICMP DoS SIMULATION]")
    target_ip = "192.168.1.5"

    for i in range(20):
        print(f"ICMP Echo Request {i+1}: -> {target_ip}")

    print("[ICMP Flood Completed]\n")


# ---------------------------------------------------------
# Run All Simulations
# ---------------------------------------------------------
sniff_packets()
capture_modify_retransmit()
syn_flood()
icmp_dos()

print("=== ALL SIMULATIONS COMPLETED (NO ERRORS) ===")