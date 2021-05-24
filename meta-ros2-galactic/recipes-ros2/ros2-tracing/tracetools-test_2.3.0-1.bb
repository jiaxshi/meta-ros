# Generated by superflore -- DO NOT EDIT
# Generated from manually modified cache.yaml, because superflore doesn't support fetching from gitlab.com (only from github.com)
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Testing utilities and tests for the tracetools package."
AUTHOR = "Christophe Bedard <bedard.christophe@gmail.com>"
ROS_AUTHOR = "Christophe Bedard <fixed-term.christophe.bourquebedard@de.bosch.com>"
HOMEPAGE = "https://index.ros.org/p/tracetools_test/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "ros2_tracing"
ROS_BPN = "tracetools_test"

ROS_BUILD_DEPENDS = " \
    lifecycle-msgs \
    rclcpp \
    rclcpp-lifecycle \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    pkgconfig-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    lifecycle-msgs \
    rclcpp \
    rclcpp-lifecycle \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python3-pytest-cov} \
    ament-cmake-gtest \
    ament-cmake-mypy \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch-ros \
    python3-pytest \
    tracetools \
    tracetools-launch \
    tracetools-read \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://gitlab.com/ros_tracing/ros2_tracing-release/archive/release/rolling/tracetools_test/2.3.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/tracetools_test"
SRC_URI = "git://gitlab.com/ros_tracing/ros2_tracing-release;${ROS_BRANCH};protocol=https"
SRCREV = "cb042445952eedce588c30c85a760c1d6183dd5e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
