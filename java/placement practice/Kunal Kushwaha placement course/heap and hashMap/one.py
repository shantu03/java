import pandas as pd
import os

# 🔹 Path to your CSV file
file_path = "C:/Users/shant/Desktop/DNS .csv"


# 🔹 Check if file exists
if not os.path.exists(file_path):
    print("❌ File not found:", file_path)
    exit()

print("✅ File found. Loading CSV...")


# 🔹 Load CSV
df = pd.read_csv(file_path)

print("\nTotal Rows (Packets):", len(df))


# 🔹 Show column names
print("\nAvailable Columns:")
print(df.columns.tolist())


# 🔹 Show first 5 rows
print("\nFirst 5 Rows:")
print(df.head())


# 🔹 Show Protocol Count (if column exists)
if "Protocol" in df.columns:
    print("\nProtocol Distribution:")
    print(df["Protocol"].value_counts())

elif "_ws.col.Protocol" in df.columns:
    print("\nProtocol Distribution:")
    print(df["_ws.col.Protocol"].value_counts())


# 🔹 Extract User-Agent (if present)
ua_columns = [col for col in df.columns if "user" in col.lower()]

if ua_columns:
    print("\nUser-Agent Columns Found:", ua_columns)

    for col in ua_columns:
        print(f"\nUnique User-Agents from {col}:")
        print(df[col].dropna().unique())

else:
    print("\n⚠️ No User-Agent column found (Probably HTTPS traffic)")


# 🔹 Show Source & Destination IP (if available)
ip_cols = [c for c in df.columns if "ip" in c.lower()]

if ip_cols:
    print("\nIP Related Columns:", ip_cols)

    for col in ip_cols:
        print(f"\nTop values in {col}:")
        print(df[col].value_counts().head())

else:
    print("\n⚠️ No IP columns found")


print("\n✅ Analysis Completed")