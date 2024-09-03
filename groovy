def countElements(List elements) {
    def elementCountMap = [:]
    elements.each { element ->
        elementCountMap[element] = elementCountMap.get(element, 0) + 1
    }
    return elementCountMap
}

def elements = [1, 3, 4, 5, 1, 5, 4]
def result = countElements(elements)
println result // Output: [1:2, 3:1, 4:2, 5:2]
