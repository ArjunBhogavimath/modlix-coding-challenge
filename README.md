
# Modlix Coding Challenge

Welcome to the **Modlix Coding Challenge Repository**! This repository contains the **Peeking Inside Pi** challenge solution.

## Repository Structure

```markdown
modlix-coding-challenge/
├── PeekingInsidePi/               # Challenge: Peeking Inside Pi
│   ├── src/                       # Java source files
│   │   ├── PiMain.java            # Main entry point
│   │   ├── PiSearch1M.java        # Searches in 1M digits
│   │   ├── PiSearch1B.java        # Searches in 1B digits
│   │   ├── PiGenerator.java       # Generates Pi digits
│   ├── data/                      # Pi digit datasets
│   │   ├── pi_1million.txt        # First 1M digits of Pi
│   │   ├── pi_1billion.txt        # First 1B digits of Pi
│   ├── README.md                  # Challenge-specific documentation
├── .gitignore                    # Git ignore rules
├── README.md                      # Main repository documentation (this file)
```

## Challenge: Peeking Inside Pi

### Problem Statement
Develop a program that:
- Checks if a given numeric string appears in the first 1 million or 1 billion digits of π
- Returns the starting index (0-based) if found, or -1 if not found
- Can optionally generate π digits up to a specified length

### Key Features
- Dual-mode search (1M or 1B digits)
- Memory-efficient chunked file reading
- Large file handling without memory overflow
- Optional π digit generation

## Getting Started

### Prerequisites
- Java JDK 8+
- Git (for cloning)

### Installation
```bash
git clone https://github.com/ArjunBhogavimath/modlix-coding-challenge.git
cd modlix-coding-challenge/PeekingInsidePi
```

### Compilation & Execution
```bash
# Compile
javac src/*.java -d out

# Run
java -cp out PiMain
```

## Usage

### Program Options
```
1. Search in 1 Million digits of Pi
2. Search in 1 Billion digits of Pi
3. Generate Pi up to N digits
```

### Example Runs

#### Search Mode
```
Choose an option: 1
Enter sequence to search: 314159

Output: Index: 0
```

#### Generation Mode
```
Choose an option: 3
Enter number of digits to generate: 10

Output: Pi: 3.1415926535
```

## Technical Details

### Optimizations
- **Chunked reading**: Processes 10MB chunks to prevent memory overload
- **Efficient searching**: Uses buffered reading for large files
- **Precision handling**: Utilizes BigDecimal for accurate π generation

### Performance
- 1M search: < 1 second
- 1B search: ~30 seconds (varies by hardware)
- Generation: O(n²) time complexity

## FAQ

**Q: Where do the π digit files come from?**  
A: They're pre-generated mathematical constants included in the repository.

**Q: What's the maximum digits I can generate?**  
A: Technically unlimited, but practically limited by memory and time constraints.


## Contact
**Mallikarjunaiah B M**  
vpmallikarjuna03@gmail.com  
[LinkedIn Profile](https://www.linkedin.com/in/mallikarjunaiah-b-m-1331a319a/)
